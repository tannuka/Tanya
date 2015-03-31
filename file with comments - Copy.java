def get(self, request, branch_name, repo_slug):
   if repo_slug and branch_name:
    repo = Repo.objects(slug=repo_slug).first()
// def get(self, request, branch_name, repo_slug):
//    if repo_slug and branch_name:
 /*         repo = Repo.objects(slug=repo_slug).first()
             if repo:*/
    #             branch = Branch.objects(repo=repo, name=branch_name).first()
    #         if not branch:
    #             return APIResponse('Branch not found', status=HTTP_404_NOT_FOUND)
    #     return APIResponse(branch)
def get(self, request, branch_name, repo_slug):
    if repo_slug and branch_name:
       repo = Repo.objects(slug=repo_slug).first()