package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpdatat", "/app.tpdatat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpdatat extends GXWebObjectStub
{
   public tpdatat( )
   {
   }

   public tpdatat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpdatat.class ));
   }

   public tpdatat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpdatat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpdatat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRENDA mas TIPO ARTICULO";
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

