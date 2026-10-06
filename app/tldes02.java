package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tldes02", "/app.tldes02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tldes02 extends GXWebObjectStub
{
   public tldes02( )
   {
   }

   public tldes02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tldes02.class ));
   }

   public tldes02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tldes02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tldes02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lab Dip Estampacion (Productos,Pasta)";
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

