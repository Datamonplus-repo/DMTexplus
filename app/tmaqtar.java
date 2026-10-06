package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqtar", "/app.tmaqtar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqtar extends GXWebObjectStub
{
   public tmaqtar( )
   {
   }

   public tmaqtar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqtar.class ));
   }

   public tmaqtar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqtar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqtar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPACIDAD MAQUINA P/T.ARTICULO";
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

