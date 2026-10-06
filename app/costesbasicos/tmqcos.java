package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesbasicos.tmqcos", "/app.costesbasicos.tmqcos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmqcos extends GXWebObjectStub
{
   public tmqcos( )
   {
   }

   public tmqcos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmqcos.class ));
   }

   public tmqcos( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmqcos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmqcos_impl(context).cleanup();
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

