package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie2ww", "/app.tdevpie2ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie2ww extends GXWebObjectStub
{
   public tdevpie2ww( )
   {
   }

   public tdevpie2ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie2ww.class ));
   }

   public tdevpie2ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie2ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie2ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion de Piezas (Detail)";
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

