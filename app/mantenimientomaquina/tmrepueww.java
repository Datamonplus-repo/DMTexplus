package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrepueww", "/app.mantenimientomaquina.tmrepueww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepueww extends GXWebObjectStub
{
   public tmrepueww( )
   {
   }

   public tmrepueww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepueww.class ));
   }

   public tmrepueww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepueww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepueww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Respuestos";
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

