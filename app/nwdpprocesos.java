package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesos", "/app.nwdpprocesos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesos extends GXWebObjectStub
{
   public nwdpprocesos( )
   {
   }

   public nwdpprocesos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesos.class ));
   }

   public nwdpprocesos( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos";
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

