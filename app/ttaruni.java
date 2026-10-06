package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttaruni", "/app.ttaruni"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttaruni extends GXWebObjectStub
{
   public ttaruni( )
   {
   }

   public ttaruni( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttaruni.class ));
   }

   public ttaruni( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttaruni_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttaruni_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TARIFA UNICA - Cliente Std";
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

