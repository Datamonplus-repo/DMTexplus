package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmr", "/app.tmordmr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmr extends GXWebObjectStub
{
   public tmordmr( )
   {
   }

   public tmordmr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmr.class ));
   }

   public tmordmr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Res Mano de Obra Orden Trabajo";
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

