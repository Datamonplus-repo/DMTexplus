package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.pcolhdre", "/app.formulaciontinte.pcolhdre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcolhdre extends GXWebObjectStub
{
   public pcolhdre( )
   {
   }

   public pcolhdre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcolhdre.class ));
   }

   public pcolhdre( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcolhdre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcolhdre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "EXISTE COLOR EN RECETA?";
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

