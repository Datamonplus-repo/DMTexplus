package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultamaquinasproduccionww", "/app.consultamaquinasproduccionww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultamaquinasproduccionww extends GXWebObjectStub
{
   public consultamaquinasproduccionww( )
   {
   }

   public consultamaquinasproduccionww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultamaquinasproduccionww.class ));
   }

   public consultamaquinasproduccionww( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultamaquinasproduccionww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultamaquinasproduccionww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Maquinas Produccion";
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

