package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tregcor", "/app.tregcor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tregcor extends GXWebObjectStub
{
   public tregcor( )
   {
   }

   public tregcor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tregcor.class ));
   }

   public tregcor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tregcor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tregcor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA REGISTROS COLORES";
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

