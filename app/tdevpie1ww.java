package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie1ww", "/app.tdevpie1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie1ww extends GXWebObjectStub
{
   public tdevpie1ww( )
   {
   }

   public tdevpie1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie1ww.class ));
   }

   public tdevpie1ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion Piezas (Header)";
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

