package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartdat", "/app.tartdat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartdat extends GXWebObjectStub
{
   public tartdat( )
   {
   }

   public tartdat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartdat.class ));
   }

   public tartdat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartdat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartdat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DATOS ARTICULOS";
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

