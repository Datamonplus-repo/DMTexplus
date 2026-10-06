package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testfam", "/app.testfam"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testfam extends GXWebObjectStub
{
   public testfam( )
   {
   }

   public testfam( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testfam.class ));
   }

   public testfam( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testfam_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testfam_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tarifa Estampacion, Familia Productos";
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

