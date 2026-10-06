package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie2", "/app.tdevpie2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie2 extends GXWebObjectStub
{
   public tdevpie2( )
   {
   }

   public tdevpie2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie2.class ));
   }

   public tdevpie2( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion de Piezas (Detail)";
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

