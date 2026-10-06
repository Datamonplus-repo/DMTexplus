package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ttipcol", "/app.formulaciontinte.ttipcol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcol extends GXWebObjectStub
{
   public ttipcol( )
   {
   }

   public ttipcol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcol.class ));
   }

   public ttipcol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo de Colorante";
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

