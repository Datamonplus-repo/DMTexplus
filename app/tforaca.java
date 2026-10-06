package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforaca", "/app.tforaca"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforaca extends GXWebObjectStub
{
   public tforaca( )
   {
   }

   public tforaca( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforaca.class ));
   }

   public tforaca( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforaca_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforaca_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FORMULAS DE ACABADO";
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

