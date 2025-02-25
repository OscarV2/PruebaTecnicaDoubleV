import { GithubUser } from './github-user';

export interface GithubSearchResponse {
  total_count: number;
  incomplete_results: boolean;
  items: GithubUser[];
}
