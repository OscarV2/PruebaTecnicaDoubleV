import { Component, Input } from '@angular/core';
import { GithubUser } from '../../models/github-user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-list',
  imports: [CommonModule],
  templateUrl: './user-list.component.html',
  styleUrl: './user-list.component.css',
})
export class UserListComponent {
  @Input() users: GithubUser[] = [];
}
