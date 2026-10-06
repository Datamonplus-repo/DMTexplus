package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.apcnore1", "/app.apcnore1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class apcnore1 extends GXWebObjectStub
{
   public apcnore1( )
   {
   }

   public apcnore1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( apcnore1.class ));
   }

   public apcnore1( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apcnore1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apcnore1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IMPRESION FORMATOS";
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

