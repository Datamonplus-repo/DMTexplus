package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.proprv", "/app.proprv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class proprv extends GXWebObjectStub
{
   public proprv( )
   {
   }

   public proprv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( proprv.class ));
   }

   public proprv( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new proprv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new proprv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla PROPRV";
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

