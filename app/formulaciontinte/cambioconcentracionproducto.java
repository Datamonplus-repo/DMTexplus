package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambioconcentracionproducto", "/app.formulaciontinte.cambioconcentracionproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambioconcentracionproducto extends GXWebObjectStub
{
   public cambioconcentracionproducto( )
   {
   }

   public cambioconcentracionproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambioconcentracionproducto.class ));
   }

   public cambioconcentracionproducto( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambioconcentracionproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambioconcentracionproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cambio Concentracion Producto";
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

