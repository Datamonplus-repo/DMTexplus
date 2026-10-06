package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmemo1", "/app.tmemo1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmemo1 extends GXWebObjectStub
{
   public tmemo1( )
   {
   }

   public tmemo1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmemo1.class ));
   }

   public tmemo1( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmemo1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmemo1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Observaciones";
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

