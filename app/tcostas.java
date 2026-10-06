package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcostas", "/app.tcostas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcostas extends GXWebObjectStub
{
   public tcostas( )
   {
   }

   public tcostas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcostas.class ));
   }

   public tcostas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcostas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcostas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SIMULACION COSTES TAS";
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

