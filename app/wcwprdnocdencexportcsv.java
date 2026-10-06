package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwprdnocdencexportcsv", "/app.wcwprdnocdencexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwprdnocdencexportcsv extends GXWebObjectStub
{
   public wcwprdnocdencexportcsv( )
   {
   }

   public wcwprdnocdencexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwprdnocdencexportcsv.class ));
   }

   public wcwprdnocdencexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwprdnocdencexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwprdnocdencexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCw Prd No Cd Enc Export CSV";
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

