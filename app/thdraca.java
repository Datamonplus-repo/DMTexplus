package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdraca", "/app.thdraca"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdraca extends GXWebObjectStub
{
   public thdraca( )
   {
   }

   public thdraca( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdraca.class ));
   }

   public thdraca( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdraca_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdraca_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AGRUPACION RECETAS ACABADO";
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

