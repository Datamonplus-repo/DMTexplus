package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqdo2", "/app.tmaqdo2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqdo2 extends GXWebObjectStub
{
   public tmaqdo2( )
   {
   }

   public tmaqdo2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqdo2.class ));
   }

   public tmaqdo2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqdo2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqdo2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentos de las máquinas";
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

