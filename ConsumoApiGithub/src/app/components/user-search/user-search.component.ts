import { Component } from '@angular/core';
import { UsersService } from '../../services/users.service';
import { GithubUser } from '../../models/github-user';
import { UserListComponent } from '../user-list/user-list.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-search',
  imports: [UserListComponent, FormsModule, CommonModule],
  templateUrl: './user-search.component.html',
  styleUrl: './user-search.component.css',
})
export class UserSearchComponent {
  searchQuery = '';
  users: GithubUser[] = [];
  error = '';
  isLoading = false;

  constructor(private githubService: UsersService) {}

  searchUsers() {
    if (!this.searchQuery.trim()) return;

    this.isLoading = true;
    this.error = '';
    this.users = [];

    this.githubService.searchUsers(this.searchQuery).subscribe({
      next: (response) => {
        this.users = response.items;
        this.isLoading = false;
      },
      error: (error) => {
        this.error = error;
        this.isLoading = false;
      },
    });
  }
}
