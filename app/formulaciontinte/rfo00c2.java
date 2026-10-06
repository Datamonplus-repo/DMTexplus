package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rfo00c2", "/app.formulaciontinte.rfo00c2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfo00c2 extends GXWebObjectStub
{
   public rfo00c2( )
   {
   }

   public rfo00c2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfo00c2.class ));
   }

   public rfo00c2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfo00c2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfo00c2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO FORMULAS (SIMULACION)";
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

