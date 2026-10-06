package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.prpstkmin", "/app.mantenimientomaquina.prpstkmin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prpstkmin extends GXWebObjectStub
{
   public prpstkmin( )
   {
   }

   public prpstkmin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prpstkmin.class ));
   }

   public prpstkmin( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prpstkmin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prpstkmin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Repuestos Stocks Bajo Minimos";
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

