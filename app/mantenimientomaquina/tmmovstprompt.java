package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmmovstprompt", "/app.mantenimientomaquina.tmmovstprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstprompt extends GXWebObjectStub
{
   public tmmovstprompt( )
   {
   }

   public tmmovstprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstprompt.class ));
   }

   public tmmovstprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Movimientos de Stock";
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

