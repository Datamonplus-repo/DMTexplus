package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1prompt", "/app.talbdet1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1prompt extends GXWebObjectStub
{
   public talbdet1prompt( )
   {
   }

   public talbdet1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1prompt.class ));
   }

   public talbdet1prompt( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mantenimiento Almacen Entradas Tela (Header)";
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

