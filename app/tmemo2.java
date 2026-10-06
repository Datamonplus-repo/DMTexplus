package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmemo2", "/app.tmemo2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmemo2 extends GXWebObjectStub
{
   public tmemo2( )
   {
   }

   public tmemo2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmemo2.class ));
   }

   public tmemo2( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmemo2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmemo2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Observaciones Generales";
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

