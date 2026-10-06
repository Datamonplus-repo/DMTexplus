package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn26", "/app.ttrn26"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn26 extends GXWebObjectStub
{
   public ttrn26( )
   {
   }

   public ttrn26( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn26.class ));
   }

   public ttrn26( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn26_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn26_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Piezas-Trozos";
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

