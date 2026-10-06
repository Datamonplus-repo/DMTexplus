package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbartro", "/app.tbartro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbartro extends GXWebObjectStub
{
   public tbartro( )
   {
   }

   public tbartro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbartro.class ));
   }

   public tbartro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbartro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbartro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trozos de una Pieza";
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

