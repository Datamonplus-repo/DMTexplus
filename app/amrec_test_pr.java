package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.amrec_test_pr", "/app.amrec_test_pr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class amrec_test_pr extends GXWebObjectStub
{
   public amrec_test_pr( )
   {
   }

   public amrec_test_pr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( amrec_test_pr.class ));
   }

   public amrec_test_pr( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new amrec_test_pr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new amrec_test_pr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MRec_test_PR";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

