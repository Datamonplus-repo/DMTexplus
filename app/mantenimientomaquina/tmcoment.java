package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmcoment", "/app.mantenimientomaquina.tmcoment"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcoment extends GXWebObjectStub
{
   public tmcoment( )
   {
   }

   public tmcoment( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcoment.class ));
   }

   public tmcoment( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcoment_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcoment_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entradas de Repuestos";
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

