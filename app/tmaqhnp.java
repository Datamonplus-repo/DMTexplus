package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqhnp", "/app.tmaqhnp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqhnp extends GXWebObjectStub
{
   public tmaqhnp( )
   {
   }

   public tmaqhnp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqhnp.class ));
   }

   public tmaqhnp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqhnp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqhnp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAQ. HORAS NO PRODUCT. MES";
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

