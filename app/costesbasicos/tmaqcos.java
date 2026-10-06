package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesbasicos.tmaqcos", "/app.costesbasicos.tmaqcos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqcos extends GXWebObjectStub
{
   public tmaqcos( )
   {
   }

   public tmaqcos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqcos.class ));
   }

   public tmaqcos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqcos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqcos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Maquina por Año/Mes";
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

