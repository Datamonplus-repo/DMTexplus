package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultadesdelconti_maquinas", "/app.formulaciontinte.consultadesdelconti_maquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadesdelconti_maquinas extends GXWebObjectStub
{
   public consultadesdelconti_maquinas( )
   {
   }

   public consultadesdelconti_maquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadesdelconti_maquinas.class ));
   }

   public consultadesdelconti_maquinas( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadesdelconti_maquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadesdelconti_maquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla HISREM";
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

