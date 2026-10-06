package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.devoluciontejido_hash_manual", "/app.almacensindetalle.devoluciontejido_hash_manual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devoluciontejido_hash_manual extends GXWebObjectStub
{
   public devoluciontejido_hash_manual( )
   {
   }

   public devoluciontejido_hash_manual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devoluciontejido_hash_manual.class ));
   }

   public devoluciontejido_hash_manual( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devoluciontejido_hash_manual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devoluciontejido_hash_manual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Manual , Hash";
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

