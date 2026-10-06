package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmovesp", "/app.tmovesp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmovesp extends GXWebObjectStub
{
   public tmovesp( )
   {
   }

   public tmovesp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmovesp.class ));
   }

   public tmovesp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmovesp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmovesp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MOVIMIENTOS ESPECIALES";
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

