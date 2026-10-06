package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcapseg", "/app.tcapseg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcapseg extends GXWebObjectStub
{
   public tcapseg( )
   {
   }

   public tcapseg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcapseg.class ));
   }

   public tcapseg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcapseg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcapseg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Distribución de capacidad en función de la segmentación";
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

