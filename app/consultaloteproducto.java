package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultaloteproducto", "/app.consultaloteproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaloteproducto extends GXWebObjectStub
{
   public consultaloteproducto( )
   {
   }

   public consultaloteproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaloteproducto.class ));
   }

   public consultaloteproducto( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaloteproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaloteproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Lotes Productos";
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

