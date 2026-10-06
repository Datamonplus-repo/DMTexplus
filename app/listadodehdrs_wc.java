package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodehdrs_wc", "/app.listadodehdrs_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodehdrs_wc extends GXWebObjectStub
{
   public listadodehdrs_wc( )
   {
   }

   public listadodehdrs_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodehdrs_wc.class ));
   }

   public listadodehdrs_wc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodehdrs_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodehdrs_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento HDRs";
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

