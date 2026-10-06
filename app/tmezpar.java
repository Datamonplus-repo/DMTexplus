package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmezpar", "/app.tmezpar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmezpar extends GXWebObjectStub
{
   public tmezpar( )
   {
   }

   public tmezpar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmezpar.class ));
   }

   public tmezpar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmezpar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmezpar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMPOSICION PARTIDOS MEZCLAS";
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

