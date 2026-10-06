package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rrecstdp", "/app.rrecstdp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rrecstdp extends GXWebObjectStub
{
   public rrecstdp( )
   {
   }

   public rrecstdp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rrecstdp.class ));
   }

   public rrecstdp( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rrecstdp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rrecstdp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta Pieza, Formato II";
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

