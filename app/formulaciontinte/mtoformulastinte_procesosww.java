package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinte_procesosww", "/app.formulaciontinte.mtoformulastinte_procesosww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinte_procesosww extends GXWebObjectStub
{
   public mtoformulastinte_procesosww( )
   {
   }

   public mtoformulastinte_procesosww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinte_procesosww.class ));
   }

   public mtoformulastinte_procesosww( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinte_procesosww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinte_procesosww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mto Formulas Tinte (Procesos)";
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

