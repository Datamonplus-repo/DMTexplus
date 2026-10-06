package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttable1", "/app.ttable1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttable1 extends GXWebObjectStub
{
   public ttable1( )
   {
   }

   public ttable1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttable1.class ));
   }

   public ttable1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttable1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttable1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CUADERNO DE ENCARGOS (MARCAS)";
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

