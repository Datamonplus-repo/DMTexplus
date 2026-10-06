package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmpreveww", "/app.mantenimientomaquina.tmpreveww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreveww extends GXWebObjectStub
{
   public tmpreveww( )
   {
   }

   public tmpreveww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreveww.class ));
   }

   public tmpreveww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreveww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreveww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Preventivo";
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

