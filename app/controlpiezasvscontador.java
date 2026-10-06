package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlpiezasvscontador", "/app.controlpiezasvscontador"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlpiezasvscontador extends GXWebObjectStub
{
   public controlpiezasvscontador( )
   {
   }

   public controlpiezasvscontador( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlpiezasvscontador.class ));
   }

   public controlpiezasvscontador( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlpiezasvscontador_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlpiezasvscontador_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Piezas vs Contador";
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

