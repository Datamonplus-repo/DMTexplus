package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesosview", "/app.nwdpprocesosview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesosview extends GXWebObjectStub
{
   public nwdpprocesosview( )
   {
   }

   public nwdpprocesosview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesosview.class ));
   }

   public nwdpprocesosview( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesosview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesosview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos View";
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

