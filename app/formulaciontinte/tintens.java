package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintens", "/app.formulaciontinte.tintens"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintens extends GXWebObjectStub
{
   public tintens( )
   {
   }

   public tintens( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintens.class ));
   }

   public tintens( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintens_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintens_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Intensidad";
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

