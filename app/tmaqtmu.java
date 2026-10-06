package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqtmu", "/app.tmaqtmu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqtmu extends GXWebObjectStub
{
   public tmaqtmu( )
   {
   }

   public tmaqtmu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqtmu.class ));
   }

   public tmaqtmu( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqtmu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqtmu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tiempos Muertos";
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

