package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rrac006", "/app.rrac006"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rrac006 extends GXWebObjectStub
{
   public rrac006( )
   {
   }

   public rrac006( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rrac006.class ));
   }

   public rrac006( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rrac006_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rrac006_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECETA ACABADO";
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

